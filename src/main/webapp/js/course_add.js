
var subjectAll = $('#subjectsID input[type="checkbox"]');
var i;

for(i = 0; i < subjectAll.length; i++) {
    console.log(subjectAll[i].value);
    var index = i + 1;
    $('#subjectsID label:eq(' + index + ')').after('&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://www.w3schools.com">主題內容</a>');
}


