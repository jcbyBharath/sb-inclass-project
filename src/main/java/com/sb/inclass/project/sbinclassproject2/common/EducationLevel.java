package com.sb.inclass.project.sbinclassproject2.common;

public enum EducationLevel {

    /** formatter:off **/
     ASSOCIATE_DEGREE(1, "Associate Degree"),
     BACHELORS_DEGREE(2, "Bachelor's Degree"),
     MASTERS_DEGREE(3, "Master's Degree"),
     DOCTORAL_DEGREE(4, "Doctoral Degree");
   /**  formatter:on **/

    public final int id;
    public final String desc;

    private EducationLevel(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static EducationLevel find(int id) {
        for(EducationLevel educationLevel: values()) {
            if(educationLevel.id == id) {
                return educationLevel;
            }
        }
        return null;
    }
}
