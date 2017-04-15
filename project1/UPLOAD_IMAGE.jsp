/*PROGRAM TO UPLOAD IMAGES AS PER SPECIFICATON*/

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="file" id="fileUpload" />
<input type="button" value="Upload" onclick="return Upload()" />
<script type="text/javascript">
function Upload() {
    //Get reference of FileUpload.
    var fileUpload = document.getElementById("fileUpload");
 
    //Check whether the file is valid Image.
    var regex = new RegExp("([a-zA-Z0-9\s_\\.\-:])+(.jpg|.png|.gif)$");
    if (regex.test(fileUpload.value.toLowerCase())) {
 
        //Check whether HTML5 is supported.
        if (typeof (fileUpload.files) != "undefined") {
            //Initiate the FileReader object.
            var reader = new FileReader();
            //Read the contents of Image File.
            reader.readAsDataURL(fileUpload.files[0]);
            reader.onload = function (e) {
                //Initiate the JavaScript Image object.
                var image = new Image();
 
                //Set the Base64 string return from FileReader as source.
                image.src = e.target.result;
                        
                //Validate the File Height and Width.
                image.onload = function () {
                    var l = 100;
                    var height = this.height;
                    var width = this.width;
                    if (height < l || width < l) {
                        alert("upload another");
                        return false;
                    }else if (height > 1000 || width > 1000 ){
	
	                  alert("crop it");
	                     return false;
                                 }
                   else
                    alert("accepted");
                    return true;
                };
 
            }
        } else {
            alert("This browser does not support HTML5.");
            return false;
        }
    } else {
        alert("Please select a valid Image file.");
        return false;
    }
}
</script>
</body>
</html>