using Common;
using VShop.Infrastructure.Abstractions.Services;
using VShop.ViewModels.Core;


namespace VShop.ViewModels;

public class CatalogViewModel : ICatalogViewModel
{
    private readonly IProductsService _productsService;

    public CatalogViewModel(IProductsService productsService)
    {
        _productsService = productsService;
        
    }

    public string Title => "Catalog";

    public IEnumerable<Product> Products => GetProducts().Result;

    private async Task<IEnumerable<Product>> GetProducts()
    {
        var response = await _productsService.GetProducts();
        return response.Value;
    }
}