FROM nginx
COPY signin.html /usr/share/nginx/html
COPY nginx.conf /etc/nginx