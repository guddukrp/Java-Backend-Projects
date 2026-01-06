
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            font-family: 'Arial', sans-serif;
            margin: 0;
        }
        .login-container {
            background: #A66DF6;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        .login-container h1 {
            margin-bottom: 20px;
            color: #333;
        }
        .input-group {
            margin-bottom: 15px;
        }
        .input-group input {
            width: 100%;
            padding: 10px 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
        }
        .input-group input:focus {
            border-color: #6a11cb;
            outline: none;
        }
        .login-btn {
            background: #6a11cb;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 18px;
            cursor: pointer;
            transition: background 0.3s ease;
        }
        .login-btn:hover {
            background: #2575fc;
        }
        .forgot-link {
            display: block;
            margin-top: 15px;
            color: #666;
            text-decoration: none;
        }
        .forgot-link:hover {
            color: #2575fc;
        }
    </style>
</head>
<body>
    <div class="login-container" >
        <h1>Login</h1>
        <form action="/login" method="post">
            <div class="input-group">
                <input type="email" placeholder="Email" required>
            </div>
            <div class="input-group">
                <input type="password" placeholder="Password" required>
            </div>
            <button type="submit" class="login-btn">Login</button>
            <a href="#" class="forgot-link">Forgot password?</a>
        </form>
    </div>
</body>
</html>
