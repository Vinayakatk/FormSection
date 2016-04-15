package org.eclipse.emf.examples.extlibrary.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.Employee;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.examples.extlibrary.test;

public class TestinAadapter {
	public static void main(String[] args) {
		
		Library createLibrary = EXTLibraryFactory.eINSTANCE.createLibrary();

		createLibrary.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				/**
				 * there is two notification for Adding of writes one is for
				 * writes two is for group people created as feature map entry
				 */
				if (Notification.SET == notification.getEventType())
					System.out.println("set event");
				if (Notification.REMOVE == notification.getEventType())
					System.out.println("remove event");
				if (Notification.ADD == notification.getEventType())
					System.out.println("add event");
				if (Notification.ADD_MANY == notification.getEventType())
					System.out.println("add many event");
				if (Notification.UNSET == notification.getEventType())
					System.out.println("unset event");
				if (Notification.MOVE == notification.getEventType())
					System.out.println("move event");
				System.out.println("changed");

				/**
				 * this is very necessary for all adapters to allow others
				 * adapters to be notified from the nofication
				 */

				super.notifyChanged(notification);
			}
		});
//		
//		createtest.setName("name");
		Writer createWriter = EXTLibraryFactory.eINSTANCE.createWriter();
		createLibrary.getWriters().add(createWriter);
		Employee createEmployee = EXTLibraryFactory.eINSTANCE.createEmployee();
		createLibrary.getEmployees().add(createEmployee);
		System.out.println(createLibrary.getPeople().get(0));
		createWriter.setFirstName("dfsdfdsf");
	}
}
