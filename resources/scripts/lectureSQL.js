// 先引入SQLGetAndSert.js
document.write("<script src='./resources/scripts/SQLGetAndSert.js'></script>")

var lecture_table
window.onload = function(){
    lecture_table = CreateTableFromInputStream(s)
    //这里先尝试更新'标题（动态获取）'
    db.transaction(function (lecture_table) {

        lecture_table.executeSql('select * from LOGS', [], function (lecture_table, results) {
            alert(results.rows.item(15).title);
            document.querySelector('#main_title').innerHTML = results.rows.item(15).title;
            // document.querySelector('#main_text').innerHTML = results.rows.item(15).title;
            document.querySelector('#main_time').innerHTML = results.rows.item(15).date;
        })
    })
}

function GetTitleFromLectureSQL(index){
    return lecture_table.rows.item(index).title
}

function GetHrefFromLectureSQL(index){
    return lecture_table.rows.item(index).href
}

function GetDateFromLectureSQL(index){
    return lecture_table.rows.item(index).date
}