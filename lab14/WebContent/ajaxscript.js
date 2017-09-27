var baseUrl = "http://jsonplaceholder.typicode.com/";

$(function() {
    $("#btn").click(getPosts);

    function getPosts() {
        let userId = $("#userId").val();
        $("#outs, .error").remove();
        let out = $("<div>", { id: "outs" });
        $.get(baseUrl + "users/" + userId)
            .done(function(data) {
                let name = $("<h1>").html(data.username);
                let email = $("<small>").html(" (" + data.email + ")");
                name.append(email);
                out.append(name);
            })
            .fail(function(xhr, st) {
                $(".loading").remove();
                out.append($("<p>", { "class": "error" })).css({ "color": "red", "font-size": "24px" }).html("Request failed: " + st);
                $("#inputs").after(out);
            })
            .then(function() {
                $.get(baseUrl + "posts", { userId: userId })
                    .done(function(data) {
                        let sec;
                        $.each(data, function(k, v) {
                            let title = $("<h4>").html((k+1)+". "+v.title);
                            let btn = $("<button>", {
                                "class": "showComment",
                                "data-postid": v.id
                            }).html("show comments");
                            title.append(btn);
                            let body = $("<p>").html(v.body);
                            sec = $("<section>").append([title, body]);
                            out.append(sec);
                        })
                    })
                    .fail(function(xhr, st) {
                        out.append($("<p>", { "class": "error" })).css({ "color": "red", "font-size": "24px" }).html("Request failed: " + st);
                    })
                    .always(function() {
                        $(".loading").remove();
                        $("#inputs").after(out);
                        $(".showComment").click(getComment);
                    });
            });

        $("#inputs").after($("<img>", { "src": "ajax-loader.gif", "class": "loading" }));
    }

    function getComment() {
        let t = $(this);
        let postId = t.data("postid");
        t.closest("section").find(".comments").remove();
        let out = $("<div>", { "class": "comments" });
        $.get(baseUrl + "comments", { postId: postId })
            .done(function(data) {
                let sec;
                $.each(data, function(k, v) {
                    let name = $("<h5>").html("("+(k+1)+")"+v.name);
                    let email = $("<small>").html(" (" + v.email + ")");
                    name.append(email);
                    let body = $("<p>").html(v.body);
                    sec = $("<div>", { "class": "comment", "data-commentid": v.id }).append([name, body]);
                    out.append(sec);
                })
            })
            .fail(function(xhr, st) {
                out.append($("<p>", { "class": "error" })).css("color", "red").html("Request failed: " + st);
            })
            .always(function() {
                $(".loading1").remove();
                t.closest("section").append(out);
            });

        t.closest("section").append($("<img>", { "src": "ajax-loader.gif", "class": "loading1" }));
    }
});