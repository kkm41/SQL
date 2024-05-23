CREATE TABLE member(
  userid VARCHAR(30) not NULL,
  pwd VARCHAR(30) NOT NULL,
  name VARCHAR(30) NOT NULL,
  phone VARCHAR(30) NULL,
  email VARCHAR(30) NULL,
  PRIMARY KEY (userid)
  );

 CREATE TABLE board(
  boardnum int not NULL AUTO_INCREMENT,
  writer VARCHAR(30) NULL,
  subject VARCHAR(100) NOT NULL,
  content VARCHAR(1000) NOT NULL,
  writedate DATETIME NULL DEFAULT now(),
  readcount INT NULL DEFAULT 0,
  PRIMARY KEY (boardnum),
 CONSTRAINT FK3
    FOREIGN KEY (writer)
    REFERENCES member (userid)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );
  
  select*from board
  
create or REPLACE VIEW mbba as
select a.userid, date_format(b.writedate, '%Y-%m-%d') as wd, a.pwd, b.boardnum, a.name, b.writer, a.phone,
			 a.email,b.subject,b.content,b.readcount
from member a , board b 
where a.userid = b.boardnum;

select*from mbba
  