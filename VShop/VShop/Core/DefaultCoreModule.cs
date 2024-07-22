using Autofac;
using Common.Abstractions.Repositories;
using Common.Repositories;
using VShop.Infrastructure.Abstractions.Repositories;
using VShop.Infrastructure.Abstractions.Services;
using VShop.Infrastructure.Repositories;
using VShop.Infrastructure.Services;

namespace VShop.Core;

public class DefaultCoreModule : Module
{
    protected override void Load(ContainerBuilder builder)
    {
        builder.RegisterType<ProductsService>().As<IProductsService>();
        
        builder.RegisterType<ApiRepository>().As<IApiRepository>();
        builder.RegisterType<ConfigurationRepository>().As<IConfigurationRepository>();
    }
}