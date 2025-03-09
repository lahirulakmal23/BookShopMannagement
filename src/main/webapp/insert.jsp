<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #f4f4f9;
    }
    form {
      background: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      width: 300px;
    }
    label {
      display: block;
      margin-bottom: 8px;
      font-weight: bold;
    }
    input, textarea, button {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 5px;
      font-size: 14px;
    }
    textarea {
      resize: none;
      height: 80px;
    }
    button {
      background-color: #007BFF;
      color: white;
      border: none;
      cursor: pointer;
      font-weight: bold;
    }
    button:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

	<form action="insertSeverlet" method="post">
	  
	    <label for="name">Product Name</label>
	    <input type="text" id="name" name="name" required>
	
	    <label for="price">Price</label>
	    <input type="number" id="price" name="price" min="0" step="0.01" required>
	    
	     <label for="quantity">category</label>
	    <input type="text" id="category" name="category" min="1" required>
	
	    <label for="quantity">Quantity</label>
	    <input type="number" id="quantity" name="quantity" min="1" required>
	    
	
	    <label for="description">Description</label>
	    <textarea id="description" name="description" placeholder="Enter product description..." required></textarea>
	
	    <button type="submit">Submit</button>
	</form>
</body>
</html>