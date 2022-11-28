
var str_id = "";
var str_pw = "";

var input_id;
var input_pw;



window.onload = function () {


    input_id = document.getElementById("id");
    input_pw = document.getElementById("pw");

   
    

}

function logIn() {

    alert("id:" + input_id.value + " pw:" + input_pw.value);
    if (input_id.value == "rigel9327" && input_pw.value == "12345678") {
        alert("로그인 성공");
        login_box.innerHTML = "회원님 반갑습니다.";
    } else {
        alert("로그인 실패");
    }
}

