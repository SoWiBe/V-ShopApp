using Common;
using Common.Endpoints.Responses.Products;
using Common.Errors;

namespace VShop.Infrastructure.Abstractions.Services;

public interface IProductsService
{
    Task<ErrorOr<GetProductsResponse>> GetProducts();
}