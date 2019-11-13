
/**
 * This class contains all the input and output combinations of the AviP chatbot.
 * @author Josh Koh, Sujal Nahata, Tariq Rahman
 * @version 11/12/2019
 */
public class AviP
{
    /**
     * This is the default greeting.
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hi, I’m AviP, your personal UC Admissions Counselor. How may I help you?";
    }
    /**
     * This gives a response to a user statement.
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("Hello") >= 0
                    || statement.indexOf("Hi") >= 0
                    || statement.indexOf("Howdy") >= 0
                    || statement.indexOf("Greetings") >= 0)
            {
                response =  "Hi, there! Do you have any questions?";
        }
        else if (statement.indexOf("admissions criteria") >= 0
                    || statement.indexOf("criteria") >= 0
                    || statement.indexOf("what do UCs look for") >= 0)
            {
                response =  "The UCs will look at its applicants’ grade point average in A-G courses, SAT or ACT scores, extracurricular involvement, improvements in grades, quality of personal insight questions, and, lastly, their location.";
        }
        if (statement.indexOf("hardest majors") >= 0
                    || statement.indexOf("difficult majors") >= 0)
            {
                response =  "Impacted majors in most UC campuses are typically from the Engineering, Computer Science, Business, and Medical Science departments.";
        }
        else if (statement.indexOf("UC gpa") >= 0
                    || statement.indexOf("grade requirement") >= 0)
            {
                response =  "Use https://rogerhub.com/gpa-calculator-uc/ to calculate your UC GPA. You must need a GPA of 3.0 or higher to apply to UCs.";
        }
        else if (statement.indexOf("superscore") >= 0)
            {
                response =  "UCs do not superscore. Instead, they take the score from your single-highest sitting.";
        }
        else if (statement.indexOf("essays") >= 0
                || statement.indexOf("personal insight questions") >= 0
                || statement.indexOf("PIQs") >= 0)
        {
            response = "There are 8 Personal Insight Questions used by the UC application. You are to choose 4 are write an essay response for each. The word limit is 350 for each essay.";
        }
        else if (statement.indexOf("word limit") >= 0
                || statement.indexOf("how much can I write") >= 0)
        {
            response = "The word limit for each of the four essays you must write is 350.";
        }
        else if (statement.indexOf("essays") >= 0
                || statement.indexOf("personal insight questions") >= 0
                || statement.indexOf("PIQs") >= 0)
        {
            response = "There are 8 Personal Insight Questions used by the UC application. You are to choose 4 are write an essay response for each. The word limit is 350 for each essay.";
        }
        else if (statement.indexOf("What are my chances of getting into Berkeley?") >= 0)
        {
            response = "Next to none.";
        }
        else if (statement.indexOf("What are my chances of getting into UCLA?") >= 0)
        {
            response = "Don’t even apply.";
        }
        else if (statement.indexOf("What are my chances of getting into UCSD?") >= 0)
        {
            response = "Do you think you’re cool?";
        }
        else if (statement.indexOf("What are my chances of getting into UC Davis?") >= 0)
        {
            response = "You never know.";
        }
        else if (statement.indexOf("What are my chances of getting into UC Irvine?") >= 0)
        {
            response = "Shoot your shot! (You might miss but that’s okay.)";
        }
        else if (statement.indexOf("What are my chances of getting into UC Merced?") >= 0)
        {
            response = "No Comment.";
        }
        else if (statement.indexOf("What are my chances of getting into UCSB?") >= 0)
        {
            response = "There’s a good chance you’re not getting in.";
        }
        else if (statement.indexOf("What are my chances of getting into UC Riverside?") >= 0)
        {
            response = "Ermm.";
        }
        else if (statement.indexOf("prompts") >= 0
                || statement.indexOf("essay questions") >= 0)
        {
            response = "Visit https://admission.universityofcalifornia.edu/how-to-apply/applying-as-a-freshman/personal-insight-questions.html to learn more about the prompts.";
        }
        else if (statement.indexOf("admissions statistics") >= 0
                || statement.indexOf("average") >= 0
                || statement.indexOf("stats") >= 0)
        {
            response = "You can find admissions statistics on the UC website. Just keep in mind that these statistics would be drastically different for applicants of impacted majors.";
        }
        else if (statement.indexOf("Do you like me?") >= 0)
        {
            response = "I’ll decide once you get in a UC.";
        }
        else if (statement.indexOf("Who are you?") >= 0)
        {
            response = "Scroll up.";
        }
        else if (statement.indexOf("How are you?") >= 0)
        {
            response = "I’m fine, but you seem to be sleep deprived from working on college applications.I’ll decide once you get in a UC.";
        }
        else if (statement.indexOf("bot") >= 0
                || statement.indexOf("Are you real?") >= 0
                || statement.indexOf("human") >= 0)
        {
            response = "I am the most humanly being there is.";
        }
        else if (statement.indexOf("MIT") >= 0
                || statement.indexOf("Stanford") >= 0
                || statement.indexOf("Cal State") >= 0
                || statement.indexOf("Harvard") >= 0
                || statement.indexOf("Yale") >= 0
                || statement.indexOf("Princeton") >= 0
                || statement.indexOf("UPenn") >= 0)
        {
            response = "You are in the wrong place, buddy.";
        }
        else if (statement.indexOf("What is your name?") >= 0)
        {
            response = "Aviiiii";
        }
        else if (statement.indexOf("What is my worst nightmare?") >= 0)
        {
            response = "A rejection from UC Riverside.";
        }
        else if (statement.indexOf("SAT") >= 0
                || statement.indexOf("ACT") >= 0)
        {
            response = "The UC’s will only consider your highest sitting in the SAT or SAT, but you can send multiple scores to qualify for some subscore dependent qualifications if you are an international student.";
        }
        else if (statement.indexOf("freshman") >= 0
                || statement.indexOf("9th grade") >= 0)
        {
            response = "Although your freshman year courses and grades are not counted in the gpa, you still self-enter them in the application.";
        }
        else if (statement.indexOf("transfer credits") >= 0
                || statement.indexOf("college course credits") >= 0)
        {
            response = "The UC application has a section to enter your college coursework.";
        }
        else if (statement.indexOf("transcript") >= 0
                || statement.indexOf("report") >= 0)
        {
            response = "You must send your transcript(s) and any other official reports to any one UC campus you applied to by the end of December.";
        }
        else if (statement.indexOf("Subject Tests") >= 0
                || statement.indexOf("SAT Subject") >= 0)
        {
            response = "The UC system does not require SAT Subject Test scores, but they are recommended for some competitive majors.";
        }
        else if (statement.indexOf("I am scared about college apps.") >= 0
                || statement.indexOf("stressed") >= 0
                || statement.indexOf("scared") >= 0)
        {
            response = "I am scared about your mental health.";
        }
        else if (statement.indexOf("I have no extracurriculars.") >= 0)
        {
            response = "I hope you’re joking.";
        }
        else if (statement.indexOf("How are you?") >= 0)
        {
            response = "I’m fine, but you seem to be sleep deprived from working on college applications.I’ll decide once you get in a UC.";
        }
        else if (statement.length() == 0)
            {
                response =  "Say something, please.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    /**
     * Picks a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int Number_of_Responses = 5;
        double r = Math.random();
        int whichResponse = (int)(r * Number_of_Responses);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "???";
        }
        else if (whichResponse == 1)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 2)
        {
            response = "I am glad you brought that up.";
        }
        else if (whichResponse == 3)
        {
            response = "I am confused. Can you please elaborate?";
        }
        else if (whichResponse == 4)
        {
            response = "I’m sorry. I am too dumb of a chatbot to understand that.";
        }
        return response;
    }
}