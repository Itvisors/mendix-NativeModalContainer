// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testmodalwidget.proxies;

public class TestContainer implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testContainerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestModalWidget.TestContainer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModalVisible("ModalVisible");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TestContainer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestContainer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testContainerMendixObject)
	{
		if (testContainerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, testContainerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.testContainerMendixObject = testContainerMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testmodalwidget.proxies.TestContainer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testmodalwidget.proxies.TestContainer(context, mendixObject);
	}

	public static testmodalwidget.proxies.TestContainer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testmodalwidget.proxies.TestContainer.initialize(context, mendixObject);
	}

	/**
	 * @return value of ModalVisible
	 */
	public final java.lang.Boolean getModalVisible()
	{
		return getModalVisible(getContext());
	}

	/**
	 * @param context
	 * @return value of ModalVisible
	 */
	public final java.lang.Boolean getModalVisible(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModalVisible.toString());
	}

	/**
	 * Set value of ModalVisible
	 * @param modalvisible
	 */
	public final void setModalVisible(java.lang.Boolean modalvisible)
	{
		setModalVisible(getContext(), modalvisible);
	}

	/**
	 * Set value of ModalVisible
	 * @param context
	 * @param modalvisible
	 */
	public final void setModalVisible(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modalvisible)
	{
		getMendixObject().setValue(context, MemberNames.ModalVisible.toString(), modalvisible);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testContainerMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testmodalwidget.proxies.TestContainer that = (testmodalwidget.proxies.TestContainer) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
