using Common;

namespace VShop.ViewModels.Core;

public interface ICatalogViewModel
{
    string Title { get; }
    IEnumerable<Product> Products { get; }
}