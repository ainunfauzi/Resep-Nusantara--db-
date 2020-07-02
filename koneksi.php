<?php
	$servername = "localhost";
	$username = "root";
	$pass = "";
	$dbname = "resep";
	
	$conn = new mysqli($servername,$username,$pass,$dbname);
	
	if ($conn->connect_error){
	die("connection failed" . $conn->connect_error);}
?>