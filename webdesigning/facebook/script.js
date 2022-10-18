$(document).ready(function () {
  $("#fname").val("First Name");
  $("#fname").on("focus", function () {
    $("#fname").val("");
  });
  $("#lname").val("Last Name");
  $("#lname").on("focus", function () {
    $("#lname").val("");
  });
  $("#email").val("Email")
  $("#email").on("focus",function()
  {
    $("#email").val("")
  })
  $("#remail").val("Re-enter Email")
  $("#remail").on("focus",function()
  {
    $("#remail").val("")
  })
  $("#pswd").val("New Password")
  $("#pswd").on("focus",function()
  {
    $("#pswd").val("")
  })
  $("#signup-form").validate({
    rules: {
      fname: {
        required: true,
        minlength: 4,
        fname:true
      },
      lname: {
        required: true,
        minlength: 4
      },
      email: {
        required: true,
       email:true
      },
      pswd:{
        minlength:6,
        maxlength:6
      },
      day:{
        required: true
      }
    },
    messages:{
        fname:{
              required:"Enter the first Name",

        }
    }
  })
})