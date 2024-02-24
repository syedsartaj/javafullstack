<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bar Graph</title>
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body>
  <div class="chart">
    <div class="bar" style="--bar-height: 80%;"><span>January</span></div>
    <div class="bar" style="--bar-height: 60%;"><span>February</span></div>
    <div class="bar" style="--bar-height: 90%;"><span>March</span></div>
    <div class="bar" style="--bar-height: 70%;"><span>April</span></div>
    <div class="bar" style="--bar-height: 85%;"><span>May</span></div>
    <div class="bar" style="--bar-height: 75%;"><span>June</span></div>
  </div>
  <div class="x-axis">
    <span>Months</span>
  </div>
  <div class="y-axis">
    <span>Values</span>
  </div>
</body>
</html>
