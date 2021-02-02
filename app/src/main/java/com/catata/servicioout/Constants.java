package com.catata.servicioout;

/**
 * Contiene las constantes de las acciones de los servicios y sus parámetros
 */
public class Constants {
    /**
     * Constantes para {@link MemoryService}
     */
    public static final String ACTION_RUN_SERVICE = "com.catata.servicioout.action.RUN_SERVICE";
    public static final String ACTION_MEMORY_EXIT = "com.catata.servicioout.action.MEMORY_EXIT";

    public static final String EXTRA_MEMORY = "com.catata.servicioout.extra.MEMORY";

    public static final String CHANNEL_ID = "NOTIFICACION";
    public static final int NOTIFICATION_ID = 0;

    /**
     * Constantes para {@link ProgressIntentService}
     */
    public static final String ACTION_RUN_ISERVICE = "com.catata.servicioout.action.RUN_INTENT_SERVICE";
    public static final String ACTION_PROGRESS_EXIT = "com.catata.servicioout.action.PROGRESS_EXIT";

    public static final String EXTRA_PROGRESS = "com.catata.servicioout.extra.PROGRESS";

}
