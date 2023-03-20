FROM alpine:3.7
RUN mkdir -p /tmp/dir && touch /tmp/dir/file1 /tmp//dir/file2
RUN file="$(ls -1 /tmp/dir)" && echo $file
RUN echo $(ls -1 /tmp/dir)