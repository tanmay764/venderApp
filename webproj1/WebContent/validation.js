function validate(frm){
	frm.vflag.value="yes";
	document.getElementById(nameErr).innerHtml="";
	document.getElementById(ageErr).innerHtml="";
	document.getElementById(nameErr).style="color:red";
	document.getElementById(ageErr).style="color:red";
	var name=frm.pname.value;
	var age=frm.page.value;
	if(name==""){
		document.getElementById("nameErr").innerHtml="persion name is mandetory";
		frm.pname.focus();
		return false;
	}
	if(age==""){
		document.getElementById("ageErr").innerHtml="persion agge is mandetory";
		frm.page.focus();
		return false;
	}
	else{
		if(isNaN(age)){
			document.getElementById("ageErr").innerHtml="persion age must numeric";
			frm.page.focus();
			frm.page.value="";
			return false;
		}
	}
	return true;
} 