<?php
include ('konek.php');
$sql = mysqli_query($konek,"select * from masakan");
$datas['records'] = array();
$baseip = 'http://192.168.43.237/resep/';
while($data=mysqli_fetch_assoc($sql)):
	$data['foto'] = $baseip.$data['foto'];
	array_push($datas['records'],$data);
endwhile;
$datas['status'] = 1;
header('Content-Type: application/json');
echo json_encode($datas);
?>