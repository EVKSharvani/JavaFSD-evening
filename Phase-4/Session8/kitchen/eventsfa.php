
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=PT+Sans"> 
<style>

img {
  border: 1px solid #ddd;
  border-radius: 4px;
  padding: 5px;
  width: 150px;
}
body {
  font-family: 'PT Sans',sans-serif;
}
.main{
  width:auto;
  height:auto;
  
  
}
.glow {
  font-size: 80px;
  color: #fff;
  text-align: center;
  animation: glow 1s ease-in-out infinite alternate;
}

@-webkit-keyframes glow {
  from {
    text-shadow: 0 0 10px #fff, 0 0 20px #0000FF, 0 0 30px #e60073, 0 0 40px #e60073, 0 0 50px #e60073, 0 0 60px #000000, 0 0 70px #e60073;
  }
 
  to {
    text-shadow: 0 0 20px #00FFFF, 0 0 30px #ff4da6, 0 0 40px #ff4da6, 0 0 50px #ff4da6, 0 0 60px #4B0082, 0 0 70px #ff4da6, 0 0 80px #00FF00;
  }
}
.main .video-bg
{
    position:fixed;
    right: 0;
    bottom: 0;
    min-width: 100%;
    min-height: 100%;
    width: auto;
    height: auto;
    z-index: -1;
}
@media(min-aspect-ratio:16/9)
{
    .video-background
    {
        width: 100%;
        height: auto;
    }
}
@media(max-aspect-ratio:16/9)
{
    .video-background
    {
        width: auto;
        height: 100%;
    }
}
#menu{
	width: 35px;
	height: 30px;
	margin: 30px 0 20px 20px;
	cursor: pointer;
}
.bar{
	height: 5px;
	width: 100%;
	background-color: #b81568;
	display: block;
	border-radius: 5px;
	transition: 0.3s ease;
}
#bar1{
	transform: translateY(-4px);
}
#bar3{
	transform: translateY(4px);
}
.nav li a{
	color: #fff;
	text-decoration: none;
}
.nav li a:hover{
	font-weight: bold;
}
.nav li{
	list-style: none;
	padding: 14px 0;
}
.nav{
	padding: 0;
	margin: 0 20px;
	transition: 0.3s ease;
	display: none;
}
.menu-bg, #menu-bar{
	top: 0;
	left: 0;
	position: absolute;
}
.menu-bg{
	z-index: 1;
	width: 0;
	height: 0;
	margin: 30px 0 20px 20px;
	background: radial-gradient(circle,#e94498,#b81568);
	border-radius: 50%;
	transition: 0.3s ease;
}
#menu-bar{
	z-index: 2;	
}
.change-bg{
	width: 550px;
	height: 540px;
	transform: translate(-60%,-30%);
}
.change .bar{
	background-color: white;
}
.change #bar1{
	transform: translateY(4px) rotateZ(-45deg);
}
.change #bar3{
	transform: translateY(-6px) rotate(45deg);
}
.change #bar2{
	opacity: 0;
}
.change{
	display: block;
}
</style>
</head>
<body>
  <div id="menu-bar">
    <div id="menu" onclick="onClickMenu()">
      <div id="bar1" class="bar"></div>
      <div id="bar2" class="bar"></div>
      <div id="bar3" class="bar"></div>
    </div>
    <ul class="nav" id="nav">
       
       <li><a href="Home.html">Home</a></li>
       <li><a href="modify.php">Modify Event</a></li>
       <li><a href="profile.php">My Profile</a></li>
       <li><a href="aboutus.html">About us</a></li>
       <li><a href="logout1.php">Log Out</li>
       </ul>
      </div>
      <div class="menu-bg" id="menu-bg"></div>
<script>
  function onClickMenu(){
	document.getElementById("menu").classList.toggle("change");
	document.getElementById("nav").classList.toggle("change");
	
	document.getElementById("menu-bg").classList.toggle("change-bg");
}
</script> 
  <div class="main">
  <video autoplay loop class="video-bg" muted plays-inline>

    <source src="even.mp4" type="video/mp4">
            </video>
<br><br>
<div class="welcome">
WELCOME SHARVANI!
</div>
<?php   
                while($rows=$result->fetch_assoc())
                { 
		              $no = $rows['no'];
             ?>
<h1 class="glow"><?php echo $rows['name'];
?></h1>
  <figure>
    <a href="desc.php?id=<?php echo $no; ?>">
<center>
<img  BORDER="0" src="<?php echo $rows['pic'];?>" style="width:900px;height:400px;">
</center>
</a>
</figure>
<?php
                }
             ?>
</div>
</body>
</html>