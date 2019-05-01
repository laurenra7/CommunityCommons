// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class Image extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.Image";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

		private java.lang.String metaName;

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

	public Image(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.Image"));
	}

	protected Image(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageMendixObject)
	{
		super(context, imageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("System.Image", imageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.Image");
	}

	/**
	 * @deprecated Use 'Image.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.Image.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MyFirstModule.ImageSpecialization", mendixObject.getType()))
			return myfirstmodule.proxies.ImageSpecialization.initialize(context, mendixObject);

		return new system.proxies.Image(context, mendixObject);
	}

	public static system.proxies.Image load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.Image.initialize(context, mendixObject);
	}

	public static java.util.List<? extends system.proxies.Image> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.Image> result = new java.util.ArrayList<system.proxies.Image>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.Image" + xpathConstraint))
			result.add(system.proxies.Image.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of PublicThumbnailPath
	 */
	public final java.lang.String getPublicThumbnailPath()
	{
		return getPublicThumbnailPath(getContext());
	}

	/**
	 * @param context
	 * @return value of PublicThumbnailPath
	 */
	public final java.lang.String getPublicThumbnailPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PublicThumbnailPath.toString());
	}

	/**
	 * Set value of PublicThumbnailPath
	 * @param publicthumbnailpath
	 */
	public final void setPublicThumbnailPath(java.lang.String publicthumbnailpath)
	{
		setPublicThumbnailPath(getContext(), publicthumbnailpath);
	}

	/**
	 * Set value of PublicThumbnailPath
	 * @param context
	 * @param publicthumbnailpath
	 */
	public final void setPublicThumbnailPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String publicthumbnailpath)
	{
		getMendixObject().setValue(context, MemberNames.PublicThumbnailPath.toString(), publicthumbnailpath);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.Image that = (system.proxies.Image) obj;
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
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "System.Image";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
