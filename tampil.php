<?php
include ('konek.php');
$sql = mysqli_query($konek,"select * from masakan");
?>
<html>
<head>
    <title>Baca Data</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>Nama</th>
            <th>Resep</th>
        </tr>
        <?php while($data=mysqli_fetch_assoc($sql)):
        ?>
        <tr>
            <td><?php echo $data['id']?></td>
            <td><?php echo $data['Nama']?></td>
            <td><?php echo $data['Resep']?></td>
            <td><a href="proses.php?id=<?php echo $data['id'];?>">Delete</a>
            <a href="tambah.php?id=<?php echo $data['id'];?>">Update</a></td>
        </tr>
        <?php endwhile;?>
    </table>
    <a href="tambah.php">tambah</a>
</body>
</html>