// Generated by Ktorfit
package services.rest

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.*
import de.jensklingenberg.ktorfit.http.*
import dto.*

public class _KtorFitRestImpl(
  private val client: KtorfitClient,
) : KtorFitRest {
  public override suspend fun getAll(page: Int, perPage: Int): List<UserDto> {
    val requestData = RequestData(method="GET",
        relativeUrl="users",
        queries = listOf(QueryData("page",page,false,QueryType.QUERY),
            QueryData("per_page",perPage,false,QueryType.QUERY)),
        returnTypeData=TypeData("kotlin.collections.List",listOf(TypeData("dto.UserDto")))) 

    return client.suspendRequest<List<UserDto>, UserDto>(requestData)!!
  }

  public override suspend fun getAllTareas(page: Int, perPage: Int): List<TareaDto> {
    val requestData = RequestData(method="GET",
        relativeUrl="todos",
        queries = listOf(QueryData("page",page,false,QueryType.QUERY),
            QueryData("per_page",perPage,false,QueryType.QUERY)),
        returnTypeData=TypeData("kotlin.collections.List",listOf(TypeData("dto.TareaDto")))) 

    return client.suspendRequest<List<TareaDto>, TareaDto>(requestData)!!
  }

  public override suspend fun create(usuario: TareaDto): TareaDto {
    val requestData = RequestData(method="POST",
        relativeUrl="todos",
        bodyData = usuario,
        returnTypeData=TypeData("dto.TareaDto")) 

    return client.suspendRequest<TareaDto, TareaDto>(requestData)!!
  }

  public override suspend fun update(id: String, usuario: TareaDto): TareaDto {
    val requestData = RequestData(method="PUT",
        relativeUrl="todos/{id}",
        bodyData = usuario,
        returnTypeData=TypeData("dto.TareaDto"),
        paths = listOf(PathData("id","$id",false))) 

    return client.suspendRequest<TareaDto, TareaDto>(requestData)!!
  }

  public override suspend fun upgrade(id: Long, usuario: TareaDto): TareaDto {
    val requestData = RequestData(method="PATCH",
        relativeUrl="todos/{id}",
        bodyData = usuario,
        returnTypeData=TypeData("dto.TareaDto"),
        paths = listOf(PathData("id","$id",false))) 

    return client.suspendRequest<TareaDto, TareaDto>(requestData)!!
  }

  public override suspend fun delete(id: String): TareaDto {
    val requestData = RequestData(method="DELETE",
        relativeUrl="todos/{id}",
        returnTypeData=TypeData("dto.TareaDto"),
        paths = listOf(PathData("id","$id",false))) 

    return client.suspendRequest<TareaDto, TareaDto>(requestData)!!
  }
}

public fun Ktorfit.createKtorFitRest(): KtorFitRest = _KtorFitRestImpl(KtorfitClient(this))
