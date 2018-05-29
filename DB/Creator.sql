CREATE TABLE "StudentGroup" (
	"ID" serial NOT NULL,
	"Number" integer NOT NULL,
	"Course" integer NOT NULL,
	"ID_Praetor" integer DEFAULT 'NULL',
	CONSTRAINT StudentGroup_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Student" (
	"ID" serial NOT NULL,
	"Mail" VARCHAR(100) NOT NULL UNIQUE,
	"ID_StudentGroup" integer DEFAULT 'NULL',
	CONSTRAINT Student_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Teacher" (
	"ID" integer NOT NULL,
	"FullName" VARCHAR(120) NOT NULL UNIQUE,
	"Mail" VARCHAR(100) NOT NULL,
	CONSTRAINT Teacher_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Schedule" (
	"ID" serial NOT NULL,
	"ID_StudentGroup" integer NOT NULL,
	"ID_Teacher_Subject" integer NOT NULL,
	CONSTRAINT Schedule_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Classroom" (
	"ID" serial NOT NULL,
	"Type" VARCHAR(50) NOT NULL UNIQUE,
	"Number" integer NOT NULL UNIQUE,
	"Available" BOOLEAN NOT NULL,
	CONSTRAINT Classroom_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Subject" (
	"ID" serial NOT NULL,
	"Naming" VARCHAR(50) NOT NULL UNIQUE,
	CONSTRAINT Subject_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "TimePlace" (
	"ID" serial NOT NULL,
	"Time_Number" integer NOT NULL,
	"Time_Day" DATE NOT NULL,
	"Day_OfWeek" VARCHAR(255) NOT NULL,
	"Odd" BOOLEAN NOT NULL,
	CONSTRAINT TimePlace_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "TeacherSubject" (
	"ID" serial NOT NULL,
	"ID_Teacher" integer NOT NULL,
	"ID_Subject" integer NOT NULL,
	"ID_Classroom" integer NOT NULL,
	"ID_TimePlace" integer NOT NULL,
	CONSTRAINT TeacherSubject_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Request" (
	"ID" serial NOT NULL,
	"ID_Group" integer NOT NULL,
	"ID_Schedule" integer NOT NULL,
	"ID_TimePlace" integer NOT NULL,
	"Approved" BOOLEAN,
	"Comment" VARCHAR(300) NOT NULL,
	CONSTRAINT Request_pk PRIMARY KEY ("ID")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "Group" ADD CONSTRAINT "Group_Praetor_fk" FOREIGN KEY ("ID_Praetor") REFERENCES "Student"("ID");

ALTER TABLE "Student" ADD CONSTRAINT "Student_StudentGroup_fk" FOREIGN KEY ("ID_StudentGroup") REFERENCES "StudentGroup"("ID");


ALTER TABLE "Schedule" ADD CONSTRAINT "Schedule_StudentGroup_fk" FOREIGN KEY ("ID_StudentGroup") REFERENCES "Group"("ID");
ALTER TABLE "Schedule" ADD CONSTRAINT "Schedule_TeacherSubject_fk" FOREIGN KEY ("ID_TeacherSubject") REFERENCES "TeacherSubject"("ID");




ALTER TABLE "TeacherSubject" ADD CONSTRAINT "TeacherSubject_Teacher_fk" FOREIGN KEY ("ID_Teacher") REFERENCES "Teacher"("ID");
ALTER TABLE "TeacherSubject" ADD CONSTRAINT "TeacherSubject_Subject_fk" FOREIGN KEY ("ID_Subject") REFERENCES "Subject"("ID");
ALTER TABLE "TeacherSubject" ADD CONSTRAINT "TeacherSubject_Classroom_fk" FOREIGN KEY ("ID_Classroom") REFERENCES "Classroom"("ID");
ALTER TABLE "TeacherSubject" ADD CONSTRAINT "TeacherSubject_TimePlace_fk" FOREIGN KEY ("ID_TimePlace") REFERENCES "TimePlace"("ID");

ALTER TABLE "Request" ADD CONSTRAINT "Request_StudentGroup_fk" FOREIGN KEY ("ID_StudentGroup") REFERENCES "StudentGroup"("ID");
ALTER TABLE "Request" ADD CONSTRAINT "Request_Schedule_fk" FOREIGN KEY ("ID_Schedule") REFERENCES "Schedule"("ID");
ALTER TABLE "Request" ADD CONSTRAINT "Request_TimePlace_fk" FOREIGN KEY ("ID_TimePlace") REFERENCES "TimePlace"("ID");

