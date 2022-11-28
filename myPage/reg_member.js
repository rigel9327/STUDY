function idCheck(){
    var ID = document.getElementById("ID").value
    if (ID.length >= 4 && ID.length <= 12) {
        
    }else{
        alert("id는 4글자이상 12자 이하로만 입력하세요");
    }
}
function pwCheck(){
    var PW = document.getElementById("PW").value
    if (PW.length >= 8 && PW.length <= 12) {
        
    }else{
        alert("pw는 8글자이상 12자 이하로만 입력하세요");
    }
}
function pw2Check(){
    var PW = document.getElementById("PW").value
    var PW2 = document.getElementById("PW2").value
    if (PW2.length >= 8 && PW2.length <= 12) {
    }else{
        alert("pw는 8글자이상 12자 이하로만 입력하세요");
    }
    if (PW == PW2) {   
    }else{
        alert("비밀번호가 서로 다릅니다.");
    }
}
function nameCheck(){
    var name = document.getElementById("name").value
    if (name.length >= 2) {
    }else{
        alert("이름을 똑바로 입력해주세요.");
    }
}
function mailCheck(){
    var mail = document.getElementById("mail").value
    if (mail.includes("@")){
    }else{
        alert("메일 입력 형식이 맞지 않습니다.");
    }
}
function phoneNumCheck(){
    var phoneNum = document.getElementById("phoneNum").value
    if (PhoneNum.length<4){
    }else{
        alert("핸드폰 번호를 제대로 입력해주세요.");
    }
}

function signUp(){
    if(ID.length >= 4 && ID.length <= 12 && PW.length >= 8 &&  PW.length <= 12 && PW == PW2 && mail.includes("@") ){
        alert("회원가입 성공, 환영합니다:)")
    }else{
        alert("제대로 입력해주세요.")
    }
}

window.onload = function () {
    var start_year = "1920";
    var today = new Date();
    var today_year = today.getFullYear();
    var index = 0;


    var start_year = "1920";// 시작할 년도
    var today = new Date();
    var today_year = today.getFullYear();
    var index = 0;
    for (var y = start_year; y <= today_year; y++) { //start_year ~ 현재 년도
        document.getElementById('select_year').options[index] = new Option(y, y);
        index++;
    }
    index = 0;
    for (var m = 1; m <= 12; m++) {
        document.getElementById('select_month').options[index] = new Option(m, m);
        index++;
    }

    lastday();

    function lastday() { //년과 월에 따라 마지막 일 구하기 
        var Year = document.getElementById('select_year').value;
        var Month = document.getElementById('select_month').value;
        var day = new Date(new Date(Year, Month, 1) - 86400000).getDate();
        /* = new Date(new Date(Year,Month,0)).getDate(); */

        var dayindex_len = document.getElementById('select_day').length;
        if (day > dayindex_len) {
            for (var i = (dayindex_len + 1); i <= day; i++) {
                document.getElementById('select_day').options[i - 1] = new Option(i, i);
            }
        }
        else if (day < dayindex_len) {
            for (var i = dayindex_len; i >= day; i--) {
                document.getElementById('select_day').options[i] = null;
            }
        }
    }
}