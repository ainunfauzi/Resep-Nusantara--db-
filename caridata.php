<?php 
	include_once "konek.php";

	$nama = $_POST['keyword'];
	

	$query = mysqli_query($konek, "SELECT * FROM masakan WHERE Nama LIKE '%".$nama."%' ");

	$num_rows = mysqli_num_rows($query);

	if ($num_rows > 0){
		$json = '{"value":1, "results": [';

		while ($row = mysqli_fetch_array($query)){
			$char ='"';

			$json .= '{
				"id": "'.str_replace($char,'`',strip_tags($row['id'])).'",
				"Nama": "'.str_replace($char,'`',strip_tags($row['Nama'])).'",
					

			},';
		}

		$json = substr($json,0,strlen($json)-1);

		$json .= ']}';

	} else {
		$json = '{"value":0, "message": "Data tidak ditemukan."}';
	}

	echo $json;

	mysqli_close($konek);
?>