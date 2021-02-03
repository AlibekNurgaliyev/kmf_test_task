//package com.alibekus.kmf_test
//
//import com.alibekus.kmf_test.models.ResponseData
//import com.alibekus.kmf_test.models.UserNameData
//import retrofit2.Call
//import retrofit2.Response
//import java.lang.Exception
//
//class DefaultRegistrationRepository(
//    private val registrationDataSource: RegistrationDataSource
//) : RegistrationDataSource {
//    override fun getInfo(
//        username: String
//    ): ResponseData<List<UserNameData>, String> {
//        return try {
//            val response: Response<List<UserNameData>> =
//                registrationDataSource.getInfo(username).execute()
//
//            if (response.isSuccessful) {
//                ResponseData.Success(response.body()!!)
//            } else {
//                ResponseData.Error("Error occurred!")
//            }
//
//        } catch (e: Exception) {
//            ResponseData.Error(e.localizedMessage ?: "Error occured")
//        }
//
//    }
//
//}