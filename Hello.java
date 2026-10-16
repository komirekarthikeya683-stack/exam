!DOCTYPE html>
<html>
<body>
<h2>Library Management System</h2>

<input id="id" placeholder="Book ID">
<button onclick="pull()">Pull</button><br>

<input id="title" placeholder="Book Title">
<button onclick="update()">Update</button>

<p id="msg"></p>

<script>
let books = {"101": "java"};

function pull() {
    title.value = books[id.value] || "";
    msg.innerText = title.value ? "Book Found" : "Book Not Found";
}

function update() {
    if (books[id.value]) {
        books[id.value] = title.value;
        msg.innerText = "Book Updated Successfully";
    } else {
        msg.innerText = "Book Not Found";
    }
}
</script>
</body>
</html>
