let user = {};

window.onload = function() {
	populatePage();

}

function populateUser() {
	// send a GET request to SessionServlet to obtain session information
	fetch("http://localhost:8088/ProjectOneFullStack/session")
			.then(function(response) {
				return response.json(); // parsing json data in the response as
				// a JS object
			}).then(
					function(data) {
						console.log(data);
						if (data.session === null) {
							window.location = "http://localhost:8088/ProjectOneFullStack/login"
						} else {
							user = data;
							document.getElementById("usernameinfo").innerText = "Username:  " + user.username;
							document.getElementById("firstnameinfo").innerText = "First name:  " + user.firstname;
							document.getElementById("lastnameinfo").innerText = "Last name:  " + user.lastname;
							document.getElementById("managerinfo").innerText = "Manager:  " + user.manager;
							document.getElementById("firstname").innerText = user.firstname;
							document.getElementById("lastname").innerText = user.lastname;

						}
					})
}
