package org.eclipse.emf.examples.extlibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Writer;

public class test {
	public static void main(String[] args) {
		EClass eClass = EXTLibraryPackage.eINSTANCE.eClass();
		final Book createBook = EXTLibraryFactory.eINSTANCE.createBook();
		createBook.eAdapters().add(new Adapter() {

			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub

			}

			public void notifyChanged(Notification notification) {
				if (Notification.SET == notification.getEventType())
					System.out.println("set book event");
				if (Notification.REMOVE == notification.getEventType())
					System.out.println("remove event");
				if (Notification.ADD == notification.getEventType())
					System.out.println("add event");
				if (Notification.ADD_MANY == notification.getEventType())
					System.out.println("add many event");

				if (Notification.MOVE == notification.getEventType())
					System.out.println("move event");
				System.out.println("changed");

			}

			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}

			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return createBook;
			}
		});
		final Library createLibrary = EXTLibraryFactory.eINSTANCE
				.createLibrary();
		createLibrary.eAdapters().add(new EContentAdapter() {

			public void notifyChanged(Notification notification) {
				Object feature = notification.getFeature();

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

		Writer createWriter = EXTLibraryFactory.eINSTANCE.createWriter();

		createLibrary.getWriters().add(createWriter);
		createWriter.setName("dfsf");

		createWriter.setFirstName("dsff");
		createWriter.setLastName("");
		createLibrary.getWriters().remove(createWriter);
	}
}
