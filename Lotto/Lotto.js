// 내 로또번호 입력//

var p = [0, 0, 0, 0, 0, 0];
for (var i = 0; i <= 5; i = i + 1) {
    p[i] = prompt(i + 1 + "번째 번호를 입력해주세요 : ");
    if (isNaN(p[i])) {
        alert("숫자만 가능합니다.");
        i = i - 1;
    }
    if (p[i] > 45) {
        alert("45보다 작은수를 입력하세요.");
        i = i - 1;
    }

    //중복, 45이상인 숫자, 문자 거르기//    

    for (var j = 0; j < i; j = j + 1) {

        if (isNaN(p[i])) {
            alert("숫자만 가능합니다.");
            i = i - 1;
            break;
        }
        if (p[i] == p[j]) {
            alert("중복된 숫자입니다.");
            i = i - 1;
            break;
        }
        if (p[i] > 45) {
            alert("45보다 작은수를 입력하세요.");
            i = i - 1;
            break;
        }

    }
}


//당첨 로또번호 생성 및 중복제거//
var r = [0, 0, 0, 0, 0, 0, 0];
for (var i = 0; i <= 6; i = i + 1) {
    r[i] = Math.floor(Math.random() * 45) + 1;
    for (var j = 0; j < i; j = j + 1) {
        if (r[i] == r[j]) {
            i = i - 1;
            break;
        }
    }
}

//당첨 횟수//
var win = 0;
for (var i = 0; i <= 5; i = i + 1) {
    for (var j = 0; j <= 5; j = j + 1) {
        if (p[i] == r[j]) {
            win = win + 1;
        }
    }
}

//출력//
document.write("내가 선택한 번호는 : " + p[0] + " " + p[1] + " " + p[2] + " " + p[3] + " " + p[4] + " " + p[5]);
document.write("<hr>");
document.write("당첨 로또번호는 : " + r[0] + " " + r[1] + " " + r[2] + " " + r[3] + " " + r[4] + " " + r[5] + " " + "( " + r[6] + " : 보너스 )");
document.write("<hr>");
document.write(win + "개 일치합니다.");
document.write("<hr>");

//등수 확인//
switch (win) {
    case 0: case 1: case 2:
        document.write("꽝입니다.");
        break;
    case 3:
        document.write("5등입니다.");
        break;
    case 4:
        document.write("4등입니다.");
        break;
    case 5:
        if (p[0] == r[6] || p[1] == r[6] || p[2] == r[6] || p[3] == r[6] || p[4] == r[6] || p[5] == r[6]) {
            document.write("2등입니다.");
        } else {
            document.write("3등입니다.");
        }
        break;
    case 6:
        document.write("1등입니다.");
        break;
}