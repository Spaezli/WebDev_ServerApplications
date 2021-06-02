# WebDev_ServerApplications

+ Java Servlets
+ RESTfull web service

# Exercise

<ol>
    <li>
        Create a Maven project and configure the servlet dependency.
    </li>
    <li>
        Extract the model classes <a href="src/guest-book.zip">guestbook.zip</a> of a guest book.
    </li>
    <li>
        Write the HTML file <code>entry.html</code> that contains a form to enter the name and comment of a guest.
    </li>
    <li>
        Implement the servlet class <code>GuestBookServlet</code> with the following methods:
        <ul>
            <li><code>doGet</code> renders all the entries of the guest book</li>
            <li><code>doPost</code> adds a new guest book entry using the <code>guest</code> and <code>comment</code>
                parameters
            </li>
        </ul>
    </li>
    <li>
        Set the character encoding of the <code>HttpServletRequest</code> and <code>HttpServletResponse</code> objects
        to UTF-8 to make sure that special characters such as umlauts are handled correctly.
    </li>
    <li>
        Implement the filter class <code>SanitizingFilter</code> whose <code>doFilter</code> method verifies that the
        request parameters only contain valid characters (optionally use the <a
            href="https://github.com/OWASP/java-html-sanitizer" target="_blank">OWASP Java HTML Sanitizer</a>).
    </li>
    <li>
        Use the locale of the <code>HttpServletRequest</code> object to format the dates of the guest book entries in
        the client's preferred locale specified in the <code>Accept</code> header (see <a
            href="https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html" target="_blank">DateTimeFormatter</a>
        class).
    </li>
</ol>