# JSP (Java Server Pages)

JSP is used to create dynamic web pages and extends servlet functionality.

## Why Use JSP Instead of Servlets?
1. **Less Code** – JSP allows embedding Java code inside HTML.
2. **Better Readability** – Separation of logic and presentation.
3. **Built-in Objects** – request, response, out, etc., simplify coding.

## JSP Scripting Elements
JSP provides three types of scripting elements:

- **Scriptlet:** `<% code %>` – Used for writing Java code.
- **Expression:** `<%= value %>` – Outputs a value to the client.
- **Declaration:** `<%! method/variable %>` – Declares variables and methods.

### Example: Basic JSP Page

#### 1. Scriptlet Tag
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <% out.print("Dua lipa akka fans hit like"); %>
</body>
</html>
```

#### 2. JSP Expression Tag
```jsp
<html>
<body>
    <%= " I support HomeLander " %>
</body>
</html>
```

#### Example: Display User Input
**File: index.jsp**
```jsp
<html>
<body>
    <form action="welcome.jsp">
        <input type="text" name="uname"><br/>
        <input type="submit" value="Go">
    </form>
</body>
</html>
```

**File: welcome.jsp**
```jsp
<html>
<body>
    <%= "Welcome " + request.getParameter("uname") %>
</body>
</html>
```

#### 3. JSP Declaration Tag
##### Declaring a Variable
```jsp
<html>
<body>
    <%! int data = 5; %>
    <%= " Homies I have:  " + data %>
</body>
</html>
```

##### Declaring a Method
```jsp
<html>
<body>
    <%!   
        int cube(int n) {  
            return n * n * n;  
        }  
    %>
    <%= "Cube of 3 is: " + cube(3) %>
</body>
</html>
```

## JSP Implicit Objects
JSP provides several built-in implicit objects.

### 1. `out` Implicit Object
Used to print output to the response.
```jsp
<%
out.print(" Yes hari sai, I'm presenting now");
%>
```

### 2. `request` Implicit Object
Used to get request parameters.
```jsp
<%
String name = request.getParameter("uname");  
out.print("Welcome " + name);
%>
```

### 3. `response` Implicit Object
Used to send responses like redirections.
#### Example: Redirecting to Google
```jsp
<%
response.sendRedirect("http://www.google.com");
%>
```

### 4. `config` Implicit Object
Used to retrieve initialization parameters from `web.xml`.
#### **web.xml Configuration:**
```xml
<web-app>
    <servlet>
        <servlet-name>WelcomeServlet</servlet-name>
        <jsp-file>/welcome.jsp</jsp-file>
        <init-param>
            <param-name>dname</param-name>
            <param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>
        </init-param>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>WelcomeServlet</servlet-name>
        <url-pattern>/welcome</url-pattern>
    </servlet-mapping>
</web-app>
```

**welcome.jsp Using `config` Object:**
```jsp
<%
out.print("Welcome " + request.getParameter("uname"));

String driver = config.getInitParameter("dname");
out.print("Driver name is: " + driver);
%>
```

### 5. `session` Implicit Object
#### Example of `session` Implicit Object
**index.html**
```html
<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>  
</html>  
```

**welcome.jsp**
```jsp
<html>  
<body>  
<%   
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
session.setAttribute("user",name);  
%>  
<a href="second.jsp">second jsp page</a>  
</body>  
</html>  
```

**second.jsp**
```jsp
<html>  
<body>  
<%   
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);  
%>  
</body>  
</html>  
```

### 6. `pageContext` Implicit Object
#### **Real-World Web Application Scenario: Customer Support Chat**
Imagine you are using a **customer support chat** on a website.
- You open a chat window and start talking to the support agent.
- The chat interface shows details like **your name, chat start time, and current page**.
- These details are **only relevant to this specific page** and **do not carry over to other pages**.

In JSP, `pageContext` works similarly. It is used to store and manage **page-specific** information.

#### **Example of `pageContext` Implicit Object**
**index.html**
```html
<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>  
</html>  
```

**welcome.jsp**
```jsp
<html>  
<body>  
<%   
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
%>  
<a href="second.jsp">second jsp page</a>  
</body>  
</html>  
```

**second.jsp**
```jsp
<html>  
<body>  
<%   
String name=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
out.print("Hello "+name);  
%>  
</body>  
</html>  
```
## Summary of Scopes in `pageContext`

| Scope Level         | Availability                                   | Access in Other Pages? |
|---------------------|----------------------------------------------|------------------------|
| **Page Scope**      | Only in the current JSP page                 | ❌ No                 |
| **Request Scope**   | Available during the request lifecycle       | ✅ Yes (if forwarded) |
| **Session Scope**   | Available throughout the user session        | ✅ Yes                |
| **Application Scope** | Available for the entire application         | ✅ Yes (Globally)      |

