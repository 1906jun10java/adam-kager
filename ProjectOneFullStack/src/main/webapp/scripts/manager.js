let user = {};

window.onload = function() {
	populateUser();
	table();
	

}

function populateUser() {
	fetch("http://localhost:8088/ProjectOneFullStack/session").then(function(response) {
		return response.json();
	}).then(function(data) {
		if(data.session === null) {
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

function table() {
	fetch("http://localhost:8088/ProjectOneFullStack/requests").then(
			function(response) {
//				console.log(response.json());
				console.log("Hello!");
				let data = response.json();
				console.log(data);	
				return data;
			}).then(function(data) {
	
		let table = document.createElement("TABLE");
		table.border = "2";

		let row = table.insertRow(-1);
		let headerCell = document.createElement("rt");
		//HEADERS
		headerCell = row.insertCell(-1);
		headerCell.innerHTML = "Request ID";

		headerCell = row.insertCell(-1);
		headerCell.innerHTML = "Employee";

		headerCell = row.insertCell(-1);
		headerCell.innerHTML = "Amount";

		headerCell = row.insertCell(-1);
		headerCell.innerHTML = "Direct Manager";

		//ROWS
		row = table.insertRow(-1);

		let cell = row.insertCell(-1);
		cell.innerHTML = data.requestId;

		cell = row.insertCell(-1);
		cell.innerHTML = data.requestEmployee;

		cell = row.insertCell(-1);
		cell.innerHTML = data.requestAmount;

		cell = row.insertCell(-1);
		cell.innerHTML = data.approveManager;

		let completeTable = document.getElementById("rt");
		completeTable.innerHTML = "";
		completeTable.appendChild(table);
	})
}
