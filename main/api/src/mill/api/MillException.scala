package mill.api

/**
 * This exception is specifically handling in [[mill.runner.MillMain]]. You can use it, if you need to exit Mill with a nice error message.
 * @param msg The error message, to be displayed to the user.
 */
class MillException(msg: String) extends Exception(msg)
