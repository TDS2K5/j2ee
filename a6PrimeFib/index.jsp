<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<h1>First 10 Prime numbers:</h1>
<%
int count = 0, num = 2;
while (count < 10) {
boolean isPrime = true;
for (int i = 2; i <= num / 2; i++) {
if (num % i == 0)
isPrime = false;
}
%>
}
if (isPrime) {
out.println(num);
count++;
}
num++;
<h1>First 10 fibonacci Series</h1>
<%
int first=0,second=1,temp;
for(int i=0;i<10;i++){
out.println(first);
temp=first+second;
first=second;
second=temp;
}
%>
</body>
</html>
