package id.wulans.githubuser.api

import id.wulans.githubuser.data.model.DetailUserResponse
import id.wulans.githubuser.data.model.User
import id.wulans.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 8c3e275e6eb01af691e2d20986d07d873d508392")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 8c3e275e6eb01af691e2d20986d07d873d508392")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 8c3e275e6eb01af691e2d20986d07d873d508392")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 8c3e275e6eb01af691e2d20986d07d873d508392")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}