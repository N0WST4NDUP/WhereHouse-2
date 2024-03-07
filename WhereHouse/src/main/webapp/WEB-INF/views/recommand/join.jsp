<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="images/home_icon.png">
    <link rel="stylesheet" href="css/join.css">
    <script language="javascript" src="js/members.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Courgette&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
    <title>WhereHouse</title>
</head>

<body>
    <div class="container" >
        <header>
            <div id="logo">
                <div class=" mb-5"></div>
                <a id="logo_text" href="index.jsp">Where House</a>
            </div>
        </header>
        <div class="mt-4 mb-4"></div>
        <section class="text-center" id="join-all-section">


            <div id="inputBox" class="me-3 ms-3 row">
                <div id="login-form-border" class="pt-3 pb-3">
                    <form action="joinOk.jsp" method="post" name="reg_frm">
                        <div class=" mt-3 mb-1" id="join-id"><input type="text" name="id" size="20" class="form-control"
                                placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;아이디"></div>
                        <div class="mb-1" id="join-pw"><input type="password" name="pw" size="20" class="form-control"
                                placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;비밀번호"></div>
                        <div class="mb-5" id="join-pwCheck"><input type="password" name="pw_check" size="20"
                                class="form-control" placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인"></div>

                        <div class="mb-1" id="join-name"><input type="text" name="name" size="20" class="form-control"
                                placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;이름"></div>
                        <div class="mb-1" id="join-nickName"><input type="text" name="nickname" size="20"
                                class="form-control" placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;닉네임"></div>
                        <div class="mb-1" id="join-tel"><input type="text" name="tel" size="20" class="form-control"
                                placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;전화번호"></div>
                        <div class="mb-4" id="join-email"><input type="text" name="email" size="20" class="form-control"
                                placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;이메일"></div>

                        <div id="logo-img"><img src="images/home_icon.png" alt=""></div>
                        <div class="mt- mb- pb-5"></div>
                        <div id="join-btn" class="button-login-box">
                            <input type="button" value="회원가입" class="btn btn-primary btn-xs mt- mb-4"
                                style="width:100%; height:60px;" onclick="infoConfirm()"></input>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </div>
</body>

</html>