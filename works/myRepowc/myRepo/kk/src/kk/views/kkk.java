package kk.views;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.xtext.example.mydsl.ui.internal.MyDslActivator;

import com.google.inject.Injector;

public class kkk implements IExecutableExtensionFactory,IExecutableExtension{

	@Override
	public Object create() throws CoreException {
		// TODO Auto-generated method stub]
		Injector injector = MyDslActivator.getInstance().getInjector(MyDslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL);
		
		
		return new SampleView(injector);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		System.out.println();
		
	}

}
