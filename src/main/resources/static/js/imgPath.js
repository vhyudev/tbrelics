//get current project path
function getRootPath_web() {
    //get current address，e.g.： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath = window.document.location.href;
    //get the directory after the host address，e.g.： uimcardprj/share/meun.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //get host address，e.g.： http://localhost:8083
    var localhostPath = curWwwPath.substring(0, pos);
    //get the project name with "/"，e.g.：/uimcardprj
    //var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    return (localhostPath);
}

//获取图片缩略图路径
function getImgThumb(addresss,state) {
    var thumb =getRootPath_web()+"/";
    var index = addresss.lastIndexOf("/");
    var prefix = "thumb/"+addresss.substring(0,index);
    var suffix = addresss.substring(index+1);
    var pos = suffix.lastIndexOf(".");
    suffix = suffix.substring(0,pos)+".jpg";
    if(state==0){
        thumb += prefix+"/small-thumb_"+suffix;
    }else if(state==1){
        thumb += prefix+"/big-thumb_"+suffix;
    }
    thumb = thumb.replaceAll("#","%23");
    return thumb;
}

String.prototype.replaceAll = function(s1,s2){
    return this.replace(new RegExp(s1,"gm"),s2);
}
