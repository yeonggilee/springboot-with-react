# 스프링 부트와 리액트 연동하기

###### 참고사이트
  * 스프링부트, 리액트 연결 방법 - https://transferhwang.tistory.com/411
  * 분리 개발 환경 구축 방법 - https://sundries-in-myidea.tistory.com/112
  * 윈도우에서 웹서버 사용 방법 - https://harrydony.tistory.com/665?category=897900

###### 핵심파일
  * react-app/package.json
  * react-app/src/setupProxy
  * react-app/src/App.js

###### nginx.conf 예시
~~~
        location / {
            root   C:/Users/yeonggi/workspace/springboot_with_react/react-app/build;
            index  index.html index.htm;
            try_files $uri $uri/ /index.html;
        }

        location /api {
            proxy_pass http://localhost:8080;
        }
~~~
