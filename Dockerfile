
ADD server.crt /usr/local/share/ca-certificates/server.crt

RUN chmod 644 /usr/local/share/ca-certificates/server.crt && update-ca-certificates