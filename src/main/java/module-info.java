/**
 * 
 */
/**
 * 
 */
module Mod323 {
    requires java.desktop;
    requires java.persistence;
    requires junit;

    opens br.com.diego.domain to org.hibernate.orm.core;
}