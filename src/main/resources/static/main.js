
function book() {
    var fname = document.getElementById("firstname").value;
    var mname = document.getElementById("middlename").value;
    var lname = document.getElementById("lastname").value;
    var phone = document.getElementById("phone").value;
    var bemail = document.getElementById("bookemail").value;
    var message = document.getElementById("msg").value;
    var departure = document.getElementById("departure").value;
    var destination = document.getElementById("destination").value;
    var departuredate = document.getElementById("departuredate").value;
    var departuretime = document.getElementById("departuretime").value;
    var arrivaldate = document.getElementById("arrivaldate").value;
    var arrivaltime = document.getElementById("arrivaltime").value;
    var service = document.getElementById("service").value;

    // var diff_in_time = departuredate.getTime() - arrivaldate.getTime();
    // var diff_in_days = diff_in_time / (1000 * 360 * 24);

    var checks = document.getElementsByClassName("checks");
    var str = "";



    for (i = 0; i < 3; i++) {
        if (checks[i].checked === true) {
            str += checks[i].value + " ";
        }
    }

    confirm("Hello " + fname + " " + mname + " " + lname + " ." +
    "The service you requested is as follows: " + service + " " + str +"\n\nDeparture" +
        "Date and Time: " + departuredate + " " + departuretime + "\n\nArrival Date: " + arrivaldate + " " + arrivaltime +
    "\n\nDeparture Country: " + departure + "\n\nArrival Country: " + destination + "\n\nEmail: " + bemail + "\n\nSince all our flights are international, we have a minimum " +
        "starting price of $1500.  We will review your info and get back to you with the best available options. Thank you!")

}

function contact() {
    var name = document.getElementById("name").value;
    var phone = document.getElementById("phone").value;
    var email = document.getElementById("email").value;
    var message = document.getElementById("msg").value;
    alert("Thank you, " + name + "! Please review your provided information. If there are no errors, click ok and we will " +
        "do our best to respond as quick as possible! \n" +
        " Phone: " + phone + "\n Email: " + email + "\n Message: " + message);



}