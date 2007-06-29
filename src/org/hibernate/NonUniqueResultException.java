//$Id$
package org.hibernate;

/**
 * Thrown when the application calls <tt>Query.uniqueResult()</tt> and
 * the query returned more than one result. Unlike all other Hibernate
 * exceptions, this one is recoverable!
 *
 * @author Gavin King
 */
public class NonUniqueResultException extends HibernateException {

	public NonUniqueResultException(int resultCount) {
		super( "query did not return a unique result: " + resultCount );
	}

}
