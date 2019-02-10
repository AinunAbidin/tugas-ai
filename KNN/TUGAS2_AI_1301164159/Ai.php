<?php
 $file="data_mhs.csv";
    $data=file_get_contents($file);
    $row=explode("\n",$data);
?>
<h2>Daftar Mahasiswa
    <table cellpadding="2" cellspacing="1" bgcolor="#999999">
      <tr bgcolor="#FFFFFF">
            <td>No</td>    
            <td>NIM</td>    
            <td>Nama</td>    
            <td>Tanggal Lahir</td>    
          </tr>  
<?php
    $no=1;
    for($x=1;$x<count($row);$x++)
      {
         list($nim,$nama,$tgl_lahir)=explode(";",$row[$x]); 
?>
      <tr bgcolor="#FFFFFF">
            <td><?php echo $no++;?></td>    
            <td><?php echo $nim;?></td>    
            <td><?php echo $nama;?></td>    
            <td><?php echo $tgl_lahir;?></td>    
          </tr>  
<?php
        }
?>
</table>