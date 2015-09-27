

    function deleteAllCookies() {
        var cookies = document.cookie.split(";");

        for (var i = 0; i < cookies.length; i++) {
            var cookie = cookies[i];
            var eqPos = cookie.indexOf("=");
            var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
            document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
        }
    }


    function doLogout() {
        /*VK.Auth.logout(authInfo);*/
        deleteAllCookies();
        window.location.href="../login/logout";
    }

/*
    function authInfo1(response) {
        if (response.session) {
            console.log("still on");
            /!*alert('userid: ' + response.session.mid);*!/
        } else {
            console.log('logouted');
            /!*alert('no user');*!/
        }
    }
*/

    function loadEventUserInfo(event) {
            VK.api("users.get", {user_ids: event.user_vk, fields: "photo,last_name,first_name"}, function (r) {
                var elem = 1;
                switch (event.event_type) {
                    case 1:
                        elem = $('#nearby');
                        break;
                    case 3:
                        elem = $('#friends');
                        break;
                    case 4:
                        elem = $('#private');
                        break;
                    case 5:
                        elem = $('#meine');
                        break;
                    default:
                        elem = $('#nearby');
                        break;
                }
                $('#meetings').append("<div class='meeting-thumbnail panel panel-default'><div class='panel-heading'><img class='meeting-creator-avatar img-rounded' src='" + r.response[0].photo + "'/><span class='meeting-creator-name'>"+r.response[0].first_name + " " + r.response[0].last_name + "</span></div></div><ul class='list-group'><li class='meeting-description list-group-item'>" +event.event_descr + "</li><li class='meeting-address list-group-item'>" +event.loc_text +"</li></ul>");

            });


    }

    // return YYYY-MM-DD HH:MI
    function formatDate(date) {
        var d = new Date(date);
        return d.getFullYear() + '-' +
            (d.getMonth()   < 9 ? '0' : '') + (d.getMonth()+1) + '-' +
            (d.getDate()    < 10 ? '0' : '') + d.getDate() +' ' +
            (d.getHours()   < 10 ? '0' : '') + d.getHours() + ':' +
            (d.getMinutes() < 10 ? '0' : '') + d.getMinutes();
    }

    function logoutResp(response) {
        if (response.session) {
            ;
        }
    }