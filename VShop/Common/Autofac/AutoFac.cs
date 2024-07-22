using Autofac;

namespace Common.Autofac;

public sealed class AutoFac
{
    private AutoFac()
    {
    
    }

    public static AutoFac Default { get; } = new();
    public ContainerBuilder Builder { get; }
    public IContainer Container { get; private set; }

    public void Build()
    {
        Container = Builder.Build();
    }
}