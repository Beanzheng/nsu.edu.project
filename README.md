# com.SSH_Test
基础ssh框架的web 项目

项目设计思路：
    1.前端功能实现
        Master.jsp
        login.jsp
        register.jsp
        detailPage.jsp
    2.后台主要功能:
        login,register,search
    3.主要package:
         com.bean   //放置成员 get/set
 				User
						uid			
						loginName
						loginPwd
						sex
				Movie
						mid
						movieName
						movieScore
						movieDirector
						movieScreenWriter
						movie_to_start
						movietype
						movieProducerRegions
						movieLanguage
						movieTime
						movieImage
         com.Dao/com.DaoImpl    //底层数据接口
 					userDao.java
							method:
											login()
											reigster()
											loginout()
					userDaoImpl.java
											
					movieDao.java
											addMovie()
											delMovie()
											modMovie()
											seaMovie()
					movieDaoImpl.java
         com.service/com.serviceImpl  //服务接口
 					userService.java
							
					userServiceImpl.java
					movieService.java
					/movieServiceImpl.java
         com.action     //动作类
 					userAction.java
					movieAction.java
         com.junit      //测试类
 					userActionTest.java
					movieActionTest.java

